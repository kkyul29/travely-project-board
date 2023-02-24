package travely.travelyprojectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travely.travelyprojectboard.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
