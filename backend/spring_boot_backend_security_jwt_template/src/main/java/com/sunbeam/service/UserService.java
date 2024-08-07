package com.sunbeam.service;

import com.sunbeam.dto.UserDTO;
import com.sunbeam.entities.User;
import com.sunbeam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
            .map(user -> new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                null, // Handle cart mapping
                null  // Handle orders mapping
            ))
            .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return new UserDTO(
            user.getId(),
            user.getUsername(),
            user.getPassword(),
            user.getEmail(),
            null, // Handle cart mapping
            null  // Handle orders mapping
        );
    }

    public UserDTO saveUser(UserDTO userDTO) {
        User user = new User(
            null,
            userDTO.getUsername(),
            userDTO.getPassword(),
            userDTO.getEmail(),
            null, // Handle cart mapping
            null  // Handle orders mapping
        );
        user = userRepository.save(user);
        userDTO.setId(user.getId());
        return userDTO;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

