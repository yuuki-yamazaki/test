package scenarios.test

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

import scala.concurrent.duration._

class Test extends Simulation {

  val sample = scenario("join").
    exec(
      http("sample").
        get("http://localhost:8080").
        check(status in(200, 400)) // 成功時は200が返り、既にユーザが存在する場合は400が返ります。
    )

  setUp(
    //100人のユーザが5分でかけて実行
    sample.inject(rampUsers(1) over (1 seconds))
  )
}
