package ch.ethz.dalab.dissolve.classification

import breeze.linalg.{Vector, DenseVector}
import scala.collection.mutable.MutableList

object Types {

  type Index = Int
  type Level = Int
  type PrimalInfo = Tuple2[Vector[Double], Double]
  type BoundedCacheList[Y] = MutableList[Y]
  type LevelHistory[Y] = Tuple2[Level, MutableList[Y]]
  
}