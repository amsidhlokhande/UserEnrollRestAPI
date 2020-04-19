package com.amsidh.mvc.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id, Table}
import lombok.Data
import scala.beans.BeanProperty


@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "USERINFO")
@SerialVersionUID(value = 1234567890L)
@Data
class User(_username: String, _emailId: String, _contactNumber: Number, _topic: String, _batchTiming: String, _isSubscribed: Boolean) extends Serializable {

  //This default constructor is required.
  def this() {
    this(null, null, 0, null, null, false)
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  @Column(name = "ID") var id: Int = _

  @Column(name = "USERNAME")
  @BeanProperty
  var username: String = _username

  @Column(name = "EMAILID")
  @BeanProperty
  var emailId: String = _emailId

  @Column(name = "CONTACTNUMBER")
  @BeanProperty
  var contactNumber: Number = _contactNumber

  @Column(name = "TOPIC")
  @BeanProperty
  var topic: String = _topic

  @Column(name = "BATCHTIMING")
  @BeanProperty
  var batchTiming: String = _batchTiming

  @Column(name = "ISSUBSCRIBED")
  @BeanProperty
  var isSubscribed: Boolean = _isSubscribed

}
