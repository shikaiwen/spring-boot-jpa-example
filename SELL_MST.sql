USE [KOWA]
GO

DROP TABLE SELL_MST

/****** Object:  Table [dbo].[SELL_MST]    Script Date: 2019/05/24 14:37:35 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[SELL_MST](

	[NO] [int] identity(1,1) NOT NULL,
	[SELL_DATE] [datetime] NULL,
    [DELIVERY_DATE] [datetime] NULL,  -- 出货日

    [PRODUCT_CODE] [nvarchar](50) NULL,

    [SELL_NUM] int NULL,
	[PRICE] [int] NULL,
	[DISCOUNT_RATE] [numeric](10, 2) NULL,

	[CUST_NO] [nvarchar](20) NULL,
	[CUST_NAME] [nvarchar](50) NULL,

    [STATUS] [nvarchar](2) NULL,  -- 0:新規　2:一部割振り  5:割振り完成

    [REMARKS] [text] NULL,

    [CREATE_DATE] [datetime] NULL,
    [UPDATE_DATE] [datetime] NULL,
PRIMARY KEY CLUSTERED
(
	[NO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


