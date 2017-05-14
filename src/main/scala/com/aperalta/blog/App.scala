package com.aperalta.blog

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

object App {
  def main(args: Array[String]) {

    val context: ApplicationContext = new ClassPathXmlApplicationContext("application-context.xml")
    val myBean: BlogComp = context.getBean("blogComp").asInstanceOf[BlogComp]
    print(myBean performTask)
  }
}