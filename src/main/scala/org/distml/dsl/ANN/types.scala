package org.distml.dsl.ANN

import breeze.linalg.{DenseMatrix, DenseVector}


object types {
  type Activation = DenseVector[Double]
  type ActivationFunction = DenseVector[Double] => DenseVector[Double]
  type LayerWeight = DenseMatrix[Double]
  type LayerX = DenseVector[Double]
  type Delta = DenseVector[Double]
}
