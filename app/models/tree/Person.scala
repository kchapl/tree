sealed trait Person

case object UnknownPerson extends Person

case class KnownPerson(
  givenNames: Seq[String],
  dateOfBirth: Date,
  dateOfDeath: Option[Date],
  mother: Person,
  father: Person
) extends Person
