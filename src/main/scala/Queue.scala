//In queue.scala both classes are present
//We made the class enqueue
class SquareQueue extends Queue {
  //This will enqueue the elements after squaring them.
  override def enqueue(item: Double): String = {
    if (rear == -1 && front == -1) {
      front += 1
      rear += 1
      val squareOfItem = scala.math.pow(item, 2) //here square of element
      queue = queue ::: List(squareOfItem)
      "Element is enqueued"
    }
    else {
      rear = rear + 1

      val squareOfItem = scala.math.pow(item, 2) //here square of element..
      queue = queue ::: List(squareOfItem)
      "Element is enqueued"
    }
  }

  print(enqueue(5) + "\n")
  print(enqueue(6) + "\n")
  print(enqueue(7) + "\n")
  print(showQueue + "\n")
  print(dequeue + "\n")
  print(showQueue + "\n")
}

// Class is declared as double queue
class DoubleQueue extends Queue {
  // Elements are queued after doubling them.
  override def enqueue(item: Double): String = {
    if (rear == -1 && front == -1) {
      front += 1
      rear += 1
      val doubleOfItem = 2 * item // here Double of Element.
      queue = queue ::: List(doubleOfItem)
      "Element  is enqueued"
    }
    else {
      rear = rear + 1
      val doubleOfItem = 2 * item // here double of the Element.

      queue = queue ::: List(doubleOfItem)
      "Element is enqueued"
    }
  }

  print(enqueue(5) + "\n")
  print(enqueue(6) + "\n")
  print(enqueue(7) + "\n")
  print(showQueue + "\n")
  print(dequeue + "\n")
  print(showQueue + "\n")
}

object Trait extends Queue with App {
  var obj = new SquareQueue()
  var doubleObj = new DoubleQueue()
}

trait Queue {
  var queue: List[Double] = List.empty
  var front: Int = -1
  var rear: Int = -1

  def enqueue(item: Double): String = {
    if (rear == -1 && front == -1) {
      front += 1
      rear += 1
      queue = queue ::: List(item)
      "Element is enqueued"
    }
    else {
      rear = rear + 1
      queue = queue ::: List(item)
      "Element is enqueued"
    }
  }

  //By this method first element from the row.
  def dequeue: String = {
    if (front == -1 && rear == -1) {
      "Underflow"
    }
    else if (front == rear) {
      queue = queue.drop(1)
      front = -1
      rear = -1
      "Element dequeued"
    }
    else {
      queue = queue.drop(1)
      front = front + 1
      "Element dequeued"
    }
  }

  def showQueue: List[Double] = {
    queue
  }
}
