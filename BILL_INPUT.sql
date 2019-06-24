USE [KOWA]
GO

DROP TABLE BILL_INPUT

/****** Object:  Table [dbo].[BILL_INPUT]    Script Date: 2019/05/24 13:33:28 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[BILL_INPUT](
	[NO] [int] IDENTITY(1,1) NOT NULL,
	[PRODUCT_CODE] [nvarchar](50) NULL,
	[BILL_NUM] [int] NULL,
	[PRICE] [int] NULL,
	[DISCOUNT_RATE] [numeric](8, 2) NULL,
	[CUST_NO] [nvarchar](20) NULL,
	[CUST_NAME] [nvarchar](50) NULL,
	[BILL_DATE] [datetime] NULL,
  [REMARKS] [text] NULL,
  [STATUS] [nvarchar](2) NULL,  -- 0:新規　2  5:割振り完成
	[CREATE_DATE] [datetime] NULL,
	[UPDATE_DATE] [datetime] NULL,
PRIMARY KEY CLUSTERED
(
	[NO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


