package backend.repository;

import backend.domain.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class JPAChallengeRepository implements ChallengeRepoistory{

    @Persistent
    private final EntityManager entityManager;

    @Autowired
    public JPAChallengeRepository(EntityManager entityManager) {this.entityManager = entityManager;}


    @Override
    public Challenge save(Challenge challenge) {
        entityManager.persist(challenge);
        return challenge;
    }


    @Override
    public List<Challenge> findAll() {
        List<Challenge> result = entityManager.createQuery("select c from Challenge c",Challenge.class)
                .getResultList();
        return result;
    }
}
