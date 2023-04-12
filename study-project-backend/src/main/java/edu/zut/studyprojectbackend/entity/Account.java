package edu.zut.studyprojectbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author y1ngq1ang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    int id;
    String username;
    String password;
    String email;
}
