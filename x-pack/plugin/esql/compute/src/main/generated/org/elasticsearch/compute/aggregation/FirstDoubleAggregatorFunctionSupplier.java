// Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
// or more contributor license agreements. Licensed under the Elastic License
// 2.0; you may not use this file except in compliance with the Elastic License
// 2.0.
package org.elasticsearch.compute.aggregation;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import org.elasticsearch.common.util.BigArrays;
import org.elasticsearch.compute.operator.DriverContext;

/**
 * {@link AggregatorFunctionSupplier} implementation for {@link FirstDoubleAggregator}.
 * This class is generated. Do not edit it.
 */
public final class FirstDoubleAggregatorFunctionSupplier implements AggregatorFunctionSupplier {
  private final BigArrays bigArrays;

  private final List<Integer> channels;

  public FirstDoubleAggregatorFunctionSupplier(BigArrays bigArrays, List<Integer> channels) {
    this.bigArrays = bigArrays;
    this.channels = channels;
  }

  @Override
  public FirstDoubleAggregatorFunction aggregator(DriverContext driverContext) {
    return FirstDoubleAggregatorFunction.create(driverContext, channels);
  }

  @Override
  public FirstDoubleGroupingAggregatorFunction groupingAggregator(DriverContext driverContext) {
    return FirstDoubleGroupingAggregatorFunction.create(channels, driverContext);
  }

  @Override
  public String describe() {
    return "first of doubles";
  }
}
