package com.amsidh.mvc.service

import com.amsidh.mvc.model.User

trait UserService {
  def addUser(user: User): Unit;

  def updateUser(id: Int, employee: User): User;

  def deleteUser(id: Int): Unit;

  def userById(id: Int): User;

  def users(): java.lang.Iterable[User];
}
