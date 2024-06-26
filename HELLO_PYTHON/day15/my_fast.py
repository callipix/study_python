import uvicorn
from fastapi import FastAPI

app = FastAPI()

@app.get("/")
async def root():
    return {"message":"hello world"}

@app.get("/param")
async def param(menu: str = "짜장면"):
    print("menu",menu)
    return "param"

if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)