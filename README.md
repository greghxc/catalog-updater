# catalog-updater

Sample repo that updates an existing catalog of items of using a current inventory.

## Sample Output
    == Initial Catalog ==
    Catalog represents books in the catalog that needs to be updated with what's currently in stock.
    CatalogEntry(ISBN=0001, priceInCents=499)
    CatalogEntry(ISBN=0002, priceInCents=499)
    CatalogEntry(ISBN=0003, priceInCents=499)
    CatalogEntry(ISBN=0004, priceInCents=499)

    == Initial Inventory ==
    Inventory represents books in stock that should be published to the catalog. Items not on this list should be removed from the catalog.
    Book(title=Title 1, author=Author 1, format=Paperback, ISBN=0001)
    Book(title=Title 2, author=Author 2, format=Paperback, ISBN=0002)
    Book(title=Title 4, author=Author 4, format=Paperback, ISBN=0004)
    Book(title=Title 5, author=Author 5, format=Paperback, ISBN=0005)

    == Publishing items to Publisher ==
    Published:Book(title=Title 1, author=Author 1, format=Paperback, ISBN=0001)
    Published:Book(title=Title 2, author=Author 2, format=Paperback, ISBN=0002)
    Published:Book(title=Title 4, author=Author 4, format=Paperback, ISBN=0004)
    Published:Book(title=Title 5, author=Author 5, format=Paperback, ISBN=0005)

    == Publishing stale items to Unpublisher ==
    Published:0003