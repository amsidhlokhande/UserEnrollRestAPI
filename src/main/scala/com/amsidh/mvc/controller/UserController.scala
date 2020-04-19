package com.amsidh.mvc.controller

import java.util.function.Consumer

import com.amsidh.mvc.model.User
import com.amsidh.mvc.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{MediaType, ResponseEntity}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(value = Array("/users"))
class UserController(@Autowired userService: UserService) {

  @RequestMapping(value = Array("/saveUser"), method = Array(RequestMethod.POST), consumes = Array(MediaType.APPLICATION_JSON_VALUE), produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def saveUser(@RequestBody user:User):ResponseEntity[java.lang.Iterable[User]]= {
    userService.addUser(user);
    userService.users().forEach(new Consumer[User] {
      override def accept(user: User): Unit = {
        println(user.toString)
      }
    })
    ResponseEntity.ok().body(userService.users());
  }


  @RequestMapping(method = Array(RequestMethod.GET), produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def allUsers(): ResponseEntity[java.lang.Iterable[User]] = {
    ResponseEntity.ok().body(userService.users());
  }
}
