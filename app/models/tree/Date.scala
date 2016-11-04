case class Date(year: Year, month: Month, day: Day)


sealed trait Year

case object UnknownYear extends Year

case class KnownYear(y: Int) extends Year


sealed trait Month

case object UnknownMonth extends Month

case class KnownMonth(m: Int) extends Month


sealed trait Day

case object UnknownDay extends Day

case class KnownDay(d: Int) extends Day
