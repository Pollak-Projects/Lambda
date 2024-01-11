package hu.szakkor.forum;

import lombok.*;


import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumUsers {

    private UUID Group;

    private UUID Subject;

}
