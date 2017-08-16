package controllers

import play.api.mvc.{Action, Controller}
import com.google.inject.Inject
import services.GreetingService

class WelcomeController @Inject()(greeter: GreetingService) extends Controller {
  def welcome() = Action {
    val greeting: String = greeter.greeting
    Ok(views.html.welcome(greeting))
  }
}