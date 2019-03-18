package main.scala
import org.scalajs.dom
import org.scalajs.dom.{Event, XMLHttpRequest}
import org.querki.jquery._

import scala.scalajs.js
import scala.scalajs.js.JSON

object JsEntry {
  def main(args: Array[String]): Unit = {
    val xhr = new XMLHttpRequest()


    xhr.onload = { _: Event =>
      if (xhr.status == 200) {
        val r: js.Dynamic = JSON.parse(xhr.responseText)
        dom.window.console.info(r)
      }
    }

    $("#btn").click((_:JQueryEventObject)=>{
      xhr.open("GET",
        "https://jsonplaceholder.typicode.com/todos/1"
      )
      xhr.send()
      dom.window.alert("Hi")
    })

  }




}
