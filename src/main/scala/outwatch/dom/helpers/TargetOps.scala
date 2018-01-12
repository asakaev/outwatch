package outwatch.dom.helpers

import org.scalajs.dom.{Event, html}

trait TargetOps {

  implicit class TargetAsInput[E <: Event, O <: Event](builder: EmitterBuilder[E, O]) {

    object target {
      def value: EmitterBuilder[E, String] = builder.map(_.target.asInstanceOf[html.Input].value)

      def valueAsNumber: EmitterBuilder[E, Int] = builder.map(_.target.asInstanceOf[html.Input].valueAsNumber)

      def checked: EmitterBuilder[E, Boolean] = builder.map(_.target.asInstanceOf[html.Input].checked)
    }

    def value: EmitterBuilder[E, String] = builder.map(e => e.currentTarget.asInstanceOf[html.Input].value)

    def valueAsNumber: EmitterBuilder[E, Int] = builder.map(e => e.currentTarget.asInstanceOf[html.Input].valueAsNumber)

    def checked: EmitterBuilder[E, Boolean] = builder.map(e => e.currentTarget.asInstanceOf[html.Input].checked)
  }

}