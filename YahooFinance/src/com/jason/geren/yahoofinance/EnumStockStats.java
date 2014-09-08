package com.jason.geren.yahoofinance;

public enum EnumStockStats {
	AfterHoursChangeRealtime("c8", 1), AnnualizedGain("g3", 2), Ask("a0", 3), AskRealtime(
			"b2", 4), AskSize("a5", 5), AverageDailyVolume("a2", 6), Bid("b0",
			7), BidRealtime("b3", 8), BidSize("b6", 9), BookValuePerShare("b4",
			10), Change("c1", 11), Change_ChangeInPercent("c0", 11), ChangeFromFiftydayMovingAverage(
			"m7", 12), ChangeFromTwoHundreddayMovingAverage("m5", 13), ChangeFromYearHigh(
			"k4", 14), ChangeFromYearLow("j5", 16), ChangeInPercent("p2", 17), ChangeInPercentRealtime(
			"k2", 18), ChangeRealtime("c6", 19), Commission("c3", 20), Currency(
			"c4", 21), DaysHigh("h0", 22), DaysLow("g0", 23), DaysRange("m0",
			24), DaysRangeRealtime("m2", 25), DaysValueChange("w1", 26), DaysValueChangeRealtime(
			"w4", 27), DividendPayDate("r1", 28), TrailingAnnualDividendYield(
			"d0", 29), TrailingAnnualDividendYieldInPercent("y0", 30), DilutedEPS(
			"e0", 31), EBITDA("j4", 32), EPSEstimateCurrentYear("e7", 33), EPSEstimateNextQuarter(
			"e9", 34), EPSEstimateNextYear("e8", 35), ExDividendDate("q0", 36), FiftydayMovingAverage(
			"m3", 37), SharesFloat("f6", 37), HighLimit("l2", 38), HoldingsGain(
			"g4", 39), HoldingsGainPercent("g1", 40), HoldingsGainPercentRealtime(
			"g5", 41), HoldingsGainRealtime("g6", 42), HoldingsValue("v1", 43), HoldingsValueRealtime(
			"v7", 44), LastTradeDate("d1", 45), LastTradePriceOnly("l1", 46), LastTradeRealtimeWithTime(
			"k1", 47), LastTradeSize("k3", 48), LastTradeTime("t1", 49), LastTradeWithTime(
			"l0", 50), LowLimit("l3", 51), MarketCapitalization("j1", 52), MarketCapRealtime(
			"j3", 53), MoreInfo("i0", 54), Name("n0", 55), Notes("n4", 56), OneyrTargetPrice(
			"t8", 57), Open("o0", 58), OrderBookRealtime("i5", 59), PEGRatio(
			"r5", 60), PERatio("r0", 61), PERatioRealtime("r2", 62), PercentChangeFromFiftydayMovingAverage(
			"m8", 63), PercentChangeFromTwoHundreddayMovingAverage("m6", 64), ChangeInPercentFromYearHigh(
			"k5", 65), PercentChangeFromYearLow("j6", 66), PreviousClose("p0",
			67), PriceBook("p6", 68), PriceEPSEstimateCurrentYear("r6", 69), PriceEPSEstimateNextYear(
			"r7", 70), PricePaid("p1", 71), PriceSales("p5", 72), Revenue("s6",
			73), SharesOwned("s1", 74), SharesOutstanding("j2", 75), ShortRatio(
			"s7", 76), StockExchange("x0", 77), Symbol("s0", 78), TickerTrend(
			"t7", 79), TradeDate("d2", 80), TradeLinks("t6", 81), TradeLinksAdditional(
			"f0", 82), TwoHundreddayMovingAverage("m4", 83), Volume("v0", 84), YearHigh(
			"k0", 85), YearLow("j0", 86), YearRange("w0", 87), ;

	private final int key;
	private final String value;

	private EnumStockStats(String value, int key) {
		this.value = value;
		this.key = key;
	}

	/**
	 * getKey: Lookup the numeric key of this object
	 * 
	 * @return an integer representing the key for this object.
	 */
	public int getKey() {
		return this.key;
	}
	
	/**
	 * getValue: Lookup the value for this object
	 * 
	 * @return a String representing the value associated this object.
	 */
	public String getValue() {
		return this.value;
	}

}// End Class