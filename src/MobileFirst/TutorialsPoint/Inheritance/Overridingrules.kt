package MobileFirst.TutorialsPoint.Inheritance

import java.awt.Polygon


open class Rectangle{
    open fun draw(){

    }
}
interface Polygon{
     fun draw(){

    }
}
class myclass:Rectangle(),MobileFirst.TutorialsPoint.Inheritance.Polygon {
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<MobileFirst.TutorialsPoint.Inheritance.Polygon>.draw() // call to Polygon.draw()
    }

}