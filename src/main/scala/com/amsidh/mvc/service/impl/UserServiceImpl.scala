package com.amsidh.mvc.service.impl

import java.lang

import com.amsidh.mvc.model.{User}
import com.amsidh.mvc.respository.UserRepository
import com.amsidh.mvc.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(@Autowired userRepository: UserRepository) extends UserService {
  override def addUser(user: User): Unit = {
    userRepository.save(user);
  }

  override def updateUser(id: Int, user: User): User = {
    val u: User = userRepository.findById(id).get()
    if (u != null) {
      u.username = user.username
      u.emailId = user.emailId
      u.contactNumber = user.contactNumber
      u.batchTiming = user.batchTiming
      u.topic = user.topic
      u.isSubscribed = user.isSubscribed
    }
    u

  }

  override def deleteUser(id: Int): Unit = {
    userRepository.deleteById(id);
  }

  override def userById(id: Int): User = {
    userRepository.findById(id).get();
  }

  override def users(): lang.Iterable[User] = {
    userRepository.findAll();
  }
}
