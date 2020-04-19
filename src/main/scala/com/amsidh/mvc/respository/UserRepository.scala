package com.amsidh.mvc.respository

import com.amsidh.mvc.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends CrudRepository[User, Int] {

}
