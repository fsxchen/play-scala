package api.version

import play.api.libs.json.Json
import javax.inject.Inject
import play.api.mvc._


class Version @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request =>
    Ok(Json.obj("version" -> "1.0"))
  }
}
