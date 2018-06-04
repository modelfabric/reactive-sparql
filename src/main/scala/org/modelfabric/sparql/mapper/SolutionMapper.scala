package org.modelfabric.sparql.mapper

import org.modelfabric.sparql.api.QuerySolution

/**
 * Implementations should be able to extract data from a query solution
 * and create a mandatory object. This may be a map of field and values
 * or case class.
 */
trait SolutionMapper[T] {

  /**
   * Extracts data from the query solution.
   *
   * @param querySolution solution containing the data.
   * @return the extracted data.
   */
  def map(querySolution : QuerySolution): T
}
