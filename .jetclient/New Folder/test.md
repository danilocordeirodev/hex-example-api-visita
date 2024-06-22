```toml
name = 'test'
method = 'POST'
url = 'http://localhost:8080/api/usuarios'
sortWeight = 1000000
id = '17731591-72ed-4d4d-872a-d850e5c52a50'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "email": "danilo@gmail.com",
  "nome": "Danilo"
}'''
```
