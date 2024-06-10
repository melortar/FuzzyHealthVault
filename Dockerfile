FROM digoxin-base-v1
WORKDIR /app
COPY . .
CMD node server.js
