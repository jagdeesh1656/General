from bs4 import BeautifulSoup
import re
import urllib2

dLink = 'http://www.indiamp3.com/index.php?in=song&term='
response = urllib2.urlopen('http://gaana.com/playlist/gaana-dj-bollywood-workout-essential')
soup = BeautifulSoup(response.read(), "html.parser")
for link in soup.find_all('a'):
	if link.get('data-type') == 'playSong':
		if len(link.string) > 1:
			nLink = link.string.replace(' ', '+')
			dLink += nLink + '&action=search&start=0'
			print (dLink)
			newResponse = urllib2.urlopen(dLink)
			soup2 = BeautifulSoup(newResponse.read(), "html.parser")
			dLink = 'http://www.indiamp3.com/index.php?in=song&term='
			if soup2.find(style="text-align: right;") is not None:
				iss = soup2.find(style="text-align: right;").a["href"]
				res = urllib2.urlopen(iss)
				soup3 = BeautifulSoup(res.read(), "html.parser")
				print soup3
			
