import requests
import simplejson

def getBooks():
    key = "YOUR API KEY"
    url = "https://api.nytimes.com/svc/books/v3/lists.json?list=hardcover-fiction&api-key=%s"

    res = requests.get(url % key)
    data = res.content

    js = simplejson.loads(data)
    results = js["results"]

    for result in results:
        book = result["book_details"]
        print(book[0]["title"])
        print()

if __name__ == "__main__":
    getBooks()
