FROM node:12 AS builder
WORKDIR /build
COPY . .
RUN npm install && npx gulp

FROM node:12
WORKDIR /app
COPY --from=builder /build/dist .
ENTRYPOINT [ "node", "./index.js" ]