package dao

import com.tinkerpop.blueprints.impls.orient.{OrientGraph, OrientGraphFactory}
import model.{Doc, User}

import scala.collection.JavaConversions._

/**
 * Weight Management DAO
 * <p>
 * Created by yevhenii on 8/15/15.
 */
class WMDAO {

  def getDocs(label: String): List[Doc] = {
    val factory = new OrientGraphFactory("remote:localhost/athlete").setupPool(1, 10)

    val tx: OrientGraph = factory.getTx
    val users = tx.getVerticesOfClass(label)

    return users.toList.map(v => new Doc(v))
  }
}