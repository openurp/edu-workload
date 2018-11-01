package org.openurp.edu.workload.model

import org.beangle.data.model.LongId
import org.openurp.edu.base.model.Teacher
import org.openurp.edu.base.model.Course

class TeachingLoad extends LongId {

  var teacher: Teacher = _

  var professionalTitle: String = _

  var course: Course = _

  var courseNatures: CourseNature = _

  var courseType: CourseType = _

  var stdCount: Int = _

  var teachCategory: TeachCategory = _
  
  var userCategory: UserCategory = _

}