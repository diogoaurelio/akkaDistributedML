package org.distml.dsl.ANN

import org.distml.dsl.ANN.types.{ActivationFunction, LayerWeight, LayerX}

case class Layer(activationFunction: ActivationFunction,
                 activationFunctionDerivative: ActivationFunction,
                 latestWeights: LayerWeight,
                 layerData: LayerX) {

}
