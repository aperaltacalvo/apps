package com.aperalta.blog
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.stereotype.Controller

@Controller
class GreetingController {
  @RequestMapping(Array("/greeting"))
  def greeting(@RequestParam(value="name", required=false, defaultValue="World") name: String, model: Model) : String = {
    model.addAttribute("name", name) 
    "template"
  }
}