package com.example.papyrus.service;

import com.example.papyrus.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
  List<UserDTO> getUserList();
}
