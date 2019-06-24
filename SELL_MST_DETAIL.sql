USE [KOWA]
GO

DROP TABLE SELL_MST_DETAIL

/****** Object:  Table [dbo].[SELL_MST]    Script Date: 2019/05/24 14:37:35 ******/

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE TABLE [dbo].[SELL_MST_DETAIL](
	[NO] [int] identity(1,1) NOT NULL,

	[SELL_NO] [int] NULL,

	[PRICE] [int] NULL,
	[DISCOUNT_RATE] [numeric](10, 2) NULL,

  [SELL_NUM] int NULL,

	[CUST_NO] [nvarchar](20) NULL,
	[CUST_NAME] [nvarchar](50) NULL,

  [PRODUCT_CODE] [nvarchar](50) NULL,

  [BILL_NO] [int] NULL,
  [BILL_DETAIL_NO] [int] NULL,

  [CONFIRM_DATE] [datetime] null, --確定時間

  [STATUS] [nvarchar](2) NULL,  -- 0:未確定　1:確定

  [CHECK_SEND_DATE] [datetime] NULL,  --事務用发货确认日

  [SELL_TYPE] [varchar](3) NULL, -- 1: 自社割振り　2:モールから 3:自社入荷

  [REMARKS] [text] NULL,

  [CREATE_DATE] [datetime] NULL,
  [UPDATE_DATE] [datetime] NULL,
PRIMARY KEY CLUSTERED
(
	[NO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


