package native

import java.nio.ByteBuffer

package object util {
  implicit class sh(val ctx: StringContext) extends AnyVal {
    def sh(args: Show.Result*) =
      Show.Interpolated(ctx.parts, args)
  }
  object sh {
    def apply(res: Show.Result) = res
  }

  final case object Unreachable extends Exception
  def unreachable = throw Unreachable
}
