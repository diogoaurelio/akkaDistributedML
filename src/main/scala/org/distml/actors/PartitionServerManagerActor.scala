package org.distml.actors

import akka.actor.{Actor, ActorLogging}
import org.distml.dsl.ANN.types.{Activation, LayerWeight}


class PartitionServerManagerActor extends Actor with ActorLogging {

  var latestWeights: LayerWeight = _
  var activations: Activation = _
  var activatedInput: Activation = _

}
