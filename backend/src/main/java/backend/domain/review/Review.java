package backend.domain.review;

import backend.domain.challenge.Challenge;
import backend.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long reviewId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String reviewContent;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime reviewDate;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int coolCount;
    @Column(columnDefinition = "INT DEFAULT 0")
    private int commentCount;

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name ="user_id")
     private User userId;

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name ="challenge_id")
     private Challenge challengeId;

     @OneToMany(mappedBy = "reviewId", cascade = CascadeType.ALL)
     private List<ReviewImage> reviewImageList = new ArrayList<>();

     public static Review createReview(User userId, Challenge challengeId, String reviewContent){
         Review review = new Review();
         review.reviewContent = reviewContent;
         review.challengeId = challengeId;
         review.userId = userId;
         review.reviewDate = LocalDateTime.now();
         return review;
     }

    // 연관관계
    public void addReviewImage(ReviewImage reviewImage) {
         this.reviewImageList.add(reviewImage);
         reviewImage.setReviewId(this);
    }
}