CREATE table product
(
productID int not null,
name text not null,
productNumber int not null,
listPrice float not null,
makeFlag BOOLEAN,
FinishedGoodsFlag BOOLEAN,
color CHARACTER(255),
safertyStockLevel CHARACTER(255),
reoderPoint FLOAT,
standardCost FLOAT,
size character not null,
sizeUnitMeans character,
weight character not null,
dayToManufacture TIMESTAMP not null,
productLine int not null,
class character not null,
style character not null,
productSubCategoryID int not null,
productModelID int not null,
sellStartDate TIMESTAMP  null,
sellStartEnd TIMESTAMP  null,
discountinedDate TIMESTAMP null,
rowgiud TIMESTAMP null,
modifiedDate TIMESTAMP,
UNIQUE(name),
UNIQUE(productNumber),
UNIQUE(productNumber),
PRIMARY key(productID)
);

create table TransactionHistory(
TransactionID int not null, 
productId int,
TransactionDate date,
TransactionType character,
Quantity int,
ActualCost int,
modifiDate TIMESTAMP,
ReferenceOderLineId int,
primary key(TransactionId)
)


create table unitMeasure(
unitMeasureCode CHARACTER(255),
name CHARACTER(255),
modifiedDate TIMESTAMP,
PRIMARY KEY(unitMeasureCode),
UNIQUE(name)
)

create table BillOfMeterials(
BillOfMeterialsID int not null, 
ProductAssemblyID int,
ComponetID int not null,
StartDate date,
endDate date,
unitMeansureCode int,
BomLevel int,
PerAssemblyQuantity int, 
modifiedDate TIMESTAMP,
primary key(BillOfMeterialsID)
)
DROP TABLE dbo.BillOfMeterials

ALTER TABLE dbo.BillOfMeterials
ADD CONSTRAINT fk_billComponentID
FOREIGN KEY(ComponetID) REFERENCES



CREATE TABLE prodcutReview
(
prodcutReviewID INT NOT NULL,
productID INT NOT NULL,
reviewerName TEXT,
reviewDate TIMESTAMP,
EmailAddress TEXT,
rating SMALLINT,
comments TEXT,
modifiedDate TIMESTAMP,
PRIMARY KEY(prodcutReviewID)
)


CREATE TABLE productListPriceHistory
(
	productID INT NOT NULL,
	startDate TIMESTAMP NOT NULL,
	endDate TIMESTAMP,
	listPrice FLOAT,
	modifiedDate TIMESTAMP,
	PRIMARY KEY(productID,startDate)
)

CREATE TABLE productPhoto
(
	productID INT,
	thumNailPhoto CHARACTER(255),
	thumNailPhotoFileName CHARACTER(255),
	largePhoto CHARACTER(255),
	largePhotoFileName CHARACTER(255),
	modifiedDate TIMESTAMP,
	primary key(productID)
)

CREATE TABLE productProductPhoto
(
	productID INT NOT NULL,
	productPhotoID INT NOT NULL,
	ModifiDate TIMESTAMP,
	primary key(productID,productPhotoID)
)

create table productSubCategory
(
productSubCategoryID int, 
name text,
rowguid character,
ModifiDate TIMESTAMP,
primary key (productSubCategoryID)
)

CREATE TABLE productCategory
(
	productCategoryID INT NOT NULL,
	name TEXT,
	rowguid CHARACTER(255),
	ModifiDate TIMESTAMP,
	UNIQUE(name),
	UNIQUE(rowguid)
)
create table productCostHistory(
productID int,
startDate date,
EndDate date,
StandardCost float,
ModifiDate TIMESTAMP,
primary key(ProductId)
)


create table productDocument
(
	productID int not null,
	documentId int not null,
	ModifiDate TIMESTAMP,
	primary key(productID,documentId)
)


create table productInventory
(
	productID int not null,
	locationID int not null,
	shalf character(255),
	bin character(255),
	quntity int,
	rowguid int,
	ModifiDate TIMESTAMP,
	primary key(productID,locationID)
)


create table WordOrderRouting(
WordOrderRoutingId int not null, 
productID int not null,
OperationSequence int not null,
LocationID int,
ScheduledStartDate date,
ScheduledStartEnd date,
ActualStartDate date,
ActualEndDate date,
ActualResources character,
ModifiDate TIMESTAMP,
primary key(WordOrderRoutingId,productID,OperationSequence)
)

create table Document(
DocumentID int ,
Title int not null, 
FileName character(255) null,
FileExtension character(255) null,
revision CHARACTER(255),
changeNumber float,
Status BOOLEAN,
DocumentSumary text,
Document text,
ModifiDate TIMESTAMP,
unique(FileName),
unique(revision),
primary key(DocumentID)
)
create table Location(
LocationId int not null, 
Name text,
CostRate float,
Availability int,
ModifiDate TIMESTAMP,
unique(name),
primary key(LocationId)
)

create table wordOrder(
	wordOrderID int not null,
	productID int not null,
	orderQuantity int, 
	stockedQuantity int,
	scrappedQuantity int,
	startDate TIMESTAMP,
	endDate TIMESTAMP,
	discontinueDate TIMESTAMP,
	scrapReasonID int,
	ModifiDate TIMESTAMP,
	primary key(wordOrderID)
)

create table scrapReson(
	scrapResonID int not null,
	name text,
	ModifiDate TIMESTAMP,
	primary key(scrapResonID)
)

CREATE TABLE productModel
(
	productModelID INT NOT NULL,
	name TEXT,
	catalogDescription TEXT,
	instructions TEXT,
	rowguid INT, 
	ModifiDate TIMESTAMP,
	PRIMARY KEY(productModelID),
	UNIQUE(name),
	UNIQUE(rowguid)
)

CREATE TABLE productModelIlustration
(
	productModelID INT NOT NULL,
	ilustrationID INT NOT NULL,
	ModifiDate TIMESTAMP
	PRIMARY KEY(productModelID,ilustrationID)
)

ALTER TABLE dbo.TransactionHistory 
ADD CONSTRAINT fk_TransactionHistory 
FOREIGN KEY(productId) REFERENCES 
dbo.product(productID)





