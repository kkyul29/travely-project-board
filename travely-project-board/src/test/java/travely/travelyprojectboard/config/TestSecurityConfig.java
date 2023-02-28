package travely.travelyprojectboard.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import travely.travelyprojectboard.domain.UserAccount;
import travely.travelyprojectboard.repository.UserAccountRepository;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockBean private UserAccountRepository userAccountRepository;

    @BeforeTestMethod
    public void securitySetup(){
        given(userAccountRepository.findById(anyString())).willReturn(Optional.of(UserAccount.of(
                "cassieTest",
                "pw",
                "cassie-test@email.com",
                "cassie-test",
                "test-memo"
        )));
    }

}
