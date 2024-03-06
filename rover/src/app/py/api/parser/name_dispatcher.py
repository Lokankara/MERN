from manager_json import save_to_json_file
from names_top import get_popular_names
from names_by_year import get_names_by
from manager_json import read_json
from names_filter import filter_names
from names_unpop import count_unpopular_names

filename = './json/names.json'
years = './json/years-2022.json'
top_100_women = './json/top-100.json'
top_men = './json/names_pop-men.json'
top_women = './json/names_pop-women.json'

years_names = read_json(years)
top_100_names = read_json(top_100_women)

print("Top 100 names:", type(top_100_names))
print("Years names:", type(years_names))
print(len(years_names[0]['girls']))
print(len(count_unpopular_names(top_100_names, years_names)))

def get_top():
    save_to_json_file(get_names_by(filename, 2022, 2023), years)
    save_to_json_file(get_popular_names(read_json(filename), 'girls', -1), top_women)
    save_to_json_file(filter_names(read_json(top_women), 100), top_100_women)
    save_to_json_file(get_popular_names(read_json(years), 'boys', 10), top_men)
