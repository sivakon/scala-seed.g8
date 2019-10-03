import org.scalatest._
import org.scalatestplus.scalacheck._

trait TestSuite
    extends FunSuite
    with Matchers
    with BeforeAndAfterAll
    with BeforeAndAfterEach
    with ScalaCheckPropertyChecks {
  final protected type Assertion = compatible.Assertion
}
