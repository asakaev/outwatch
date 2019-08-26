```scala mdoc:js:shared
import org.scalajs.dom.window.setInterval
import scala.scalajs.js.Date
```
```scala mdoc:js
setInterval(() => {
  node.innerHTML = new Date().toString()
}, 1000)
```
