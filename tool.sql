
 select @@VERSION

-- get ALL COLUMN WITH AS
DECLARE @alias varchar(10);
set @alias = 'A'
select   @alias + '.' + name + ' AS ' + @alias + '_'+name + ','
   from syscolumns
where id=(select max(id) from sysobjects where xtype='u' and name='BILL_INPUT_DETAIL')









