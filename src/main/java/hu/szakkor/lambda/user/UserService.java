package hu.szakkor.lambda.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void save(UserRequest request) {
        final User user = User.builder()
                .email(request.email())
                .password(request.password())
                .birthDate(request.birthDate())
                .omId(request.omId())
                .build();
    }
}
