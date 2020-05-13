package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalatest._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

trait TestSuite
    extends AnyFunSuite
    with should.Matchers
    with BeforeAndAfterAll
    with BeforeAndAfterEach {
  final protected type Assertion =
    org.scalatest.compatible.Assertion
}

