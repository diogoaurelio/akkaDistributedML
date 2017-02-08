package org.distml.messages

import akka.remote.ContainerFormats.ActorRef
import org.distml.dsl.ANN.types.{Delta, LayerX}
import breeze.linalg.{DenseMatrix, DenseVector}


object LayerCommunication {

  sealed class LayerMsg

  case class Gradient(g: DenseMatrix[Double], replicaId: Int, layerId: Int)
  case class ForwardPass(inputs: LayerX, target: DenseVector[Double])
  case class BackwardPass(deltas: Delta)
  case class nextLayer(layerActor: ActorRef)
}
