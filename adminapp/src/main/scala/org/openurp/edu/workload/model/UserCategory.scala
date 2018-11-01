package org.openurp.edu.workload.model

import org.beangle.data.model.LongId
import org.beangle.data.model.pojo.Named
import org.beangle.data.model.pojo.Coded

class UserCategory extends LongId with Named with Coded {
  
  var basicTeachingLoad: Int = 0

}