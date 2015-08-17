package model

import com.tinkerpop.blueprints.Vertex
import play.api.libs.json.Json.JsValueWrapper
import play.api.libs.json._

import scala.collection.JavaConversions._

/**
 * Represents single row
 *
 * Created by yevhenii on 8/16/15.
 */
class Doc(val v: Vertex) {
  def toMap: Map[String, Object] =
    Map("id" -> v.getId) ++
      v.getPropertyKeys.toIterable.map(k => k -> v.getProperty(k))(collection.breakOut)
}

object Doc {

  implicit val writeAnyMapFormat = new Writes[Doc] {
    def writes(doc: Doc): JsValue = {
      Json.obj(doc.toMap.map {
        case (s, a) => {
          val ret: (String, JsValueWrapper) = a match {
            case _: String => s -> JsString(a.asInstanceOf[String])
            case _: java.util.Date => s -> JsString(a.toString)
            case None => s -> JsNull
            case JsArray(elements) => s -> JsArray(elements)
            case _ => s -> (if (a != null) JsString(a.toString) else JsNull)
          }
          ret
        }
      }.toSeq: _*)

    }
  }
}
