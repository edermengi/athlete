package controllers

import javax.inject._

import dao.WMDAO
import model.Doc._
import play.api.libs.json.Json
import play.api.mvc._

class Tables @Inject()(dao: WMDAO) extends Controller {

  def getTable(table: String) = Action {
    Ok(
      Json.toJson(dao.getDocs(table))
    )
  }

}
