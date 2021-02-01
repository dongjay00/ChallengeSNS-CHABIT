package backend.repository;

import backend.domain.Challenge;
import backend.service.ChallengeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
@WebAppConfiguration
class JPAChallengeRepositoryTest {

    @Autowired
    ChallengeService challengeService;
    @Autowired
    ChallengeRepoistory challengeRepoistory;

    @Test
    void save() {
        //given
        Challenge challenge =  new Challenge();
        challenge.setChallengeName("챌린지 테스트");
        challenge.setChallengeDesc("챌린지 설명");
        challenge.setChallengeOwner(1L);
        challenge.setChallengeCategory(1L);
        challenge.setChallengeStartDate(LocalDateTime.now());
        challenge.setChallengeEndDate(LocalDateTime.now().plusDays(1));
        challenge.setAuthFrequency("주 2회인증");
        challenge.setAuthHoliday(1);
        //when
        challengeService.makeChallenge(challenge);
        //then
        org.assertj.core.api.Assertions.assertThat(challenge.getAuthFrequency()).isEqualTo("주 2회인증");
//        org.assertj.core.api.Assertions.assertThat(challenge.getChallengeOnGoing()).isEqualTo("READY");
    }
    @Test
    void findAll(){
        Challenge challenge =  new Challenge();
        challenge.setChallengeName("챌린지 테스트2");
        challenge.setChallengeDesc("챌린지 설명2");
        challenge.setChallengeOwner(1L);
        challenge.setChallengeCategory(1L);
        challenge.setChallengeStartDate(LocalDateTime.now());
        challenge.setChallengeEndDate(LocalDateTime.now().plusDays(1));
        challenge.setAuthFrequency("주 3회인증");
        challenge.setAuthHoliday(1);
        Challenge challenge2 =  new Challenge();
        challenge2.setChallengeName("챌린지 테스트");
        challenge2.setChallengeDesc("챌린지 설명");
        challenge2.setChallengeOwner(1L);
        challenge2.setChallengeCategory(1L);
        challenge2.setChallengeStartDate(LocalDateTime.now());
        challenge2.setChallengeEndDate(LocalDateTime.now().plusDays(1));
        challenge2.setAuthFrequency("주 3회인증");
        challenge2.setAuthHoliday(3);

        challengeService.makeChallenge(challenge);
        challengeService.makeChallenge(challenge2);

        List<Challenge> result = new ArrayList<>();
        result = challengeService.findChallenges();
        org.assertj.core.api.Assertions.assertThat(result.size()==2);
        org.assertj.core.api.Assertions.assertThat(result.get(0).getAuthHoliday() == 1);
        org.assertj.core.api.Assertions.assertThat(result.get(1).getAuthHoliday() == 3);
    }
}

